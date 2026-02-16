package playamarBank;

import java.time.LocalDate;


/**
 * La clase {@code PlayamarBank} representa una cuenta bancaria con control de
 * descubierto, embargo y saldo máximo.
 * <p>
 * Cada cuenta tiene un identificador único con el formato AAAA-NNNN, donde
 * AAAA es el año de creación de la cuenta y NNNN es un número consecutivo que
 * se reinicia cada año.
 * </p>
 * <p>
 * La cuenta permite ingresos, extracciones con control de descubierto y
 * la aplicación de un embargo que bloquea un porcentaje del saldo.
 * </p>
 */
public class PlayamarBank {
	
	
    public static final double DEFAULT_SALDO = 0.0;//Saldo por defecto de una cuenta
    public static final double DEFAULT_MAX_DESCUBIERTO = 0.0;//Límite de descubierto por defecto
    public static final double MAX_DESCUBIERTO = -2000.0;//Límite máximo permitido de descubierto
    public static final double MAX_EMBARGO = 100.0;//Porcentaje máximo de embargo permitido
    public static final double MIN_EMBARGO = 0.0;//Porcentaje mínimo de embargo permitido
    public static final double MAX_SALDO = 50000000.0;//Saldo máximo permitido en la cuenta
    public static final int MIN_YEAR = 1900;//Año mínimo permitido para la fecha de creación
    private static int contadorAnual = 0;//Contador anual para la generación del identificador
    private static int ultimoAnio = -1;//Último año registrado para reiniciar el contador

    private String id;//Identificador único de la cuenta
    private double saldo;//Saldo actual de la cuenta
    private double limiteDescubierto;//Límite máximo de descubierto permitido
    private double porcentajeEmbargo;//Porcentaje de saldo embargado
    private double saldoMaximo;//Saldo máximo permitido en la cuenta
    private double totalIngresado;//Total de dinero ingresado en la cuenta
    private LocalDate fechaCreacion;//Fecha de creación de la cuenta

    
    /**
     * Construye una cuenta PlayamarBank con los valores indicados.
     *
     * @param saldoInicial saldo inicial de la cuenta
     * @param fechaCreacion fecha en la que se crea la cuenta
     * @param limiteDescubierto límite máximo de descubierto permitido
     * @throws IllegalArgumentException si alguno de los valores no es válido
     */
public PlayamarBank(double saldoInicial, LocalDate fechaCreacion, double limiteDescubierto) throws IllegalArgumentException {   
	
	if (fechaCreacion.getYear() < MIN_YEAR || fechaCreacion == null) {
        throw new IllegalArgumentException("Fecha de creación no valida");
    }
	if (saldoInicial < DEFAULT_SALDO || saldoInicial > MAX_SALDO) {
        throw new IllegalArgumentException("Saldo inicial no válido");
    }

    if (limiteDescubierto < MAX_DESCUBIERTO || limiteDescubierto > DEFAULT_MAX_DESCUBIERTO) {
        throw new IllegalArgumentException("Límite de descubierto no válido");
    }

    int anio = fechaCreacion.getYear();

	if (anio != ultimoAnio) {
        contadorAnual = 0;
        ultimoAnio = anio;
    }

    this.id = anio + "-" + String.format("%04d", contadorAnual++);
    this.saldo = saldoInicial;
    this.limiteDescubierto = limiteDescubierto;
    this.porcentajeEmbargo = MIN_EMBARGO;
    this.saldoMaximo = MAX_SALDO;
    this.totalIngresado = saldoInicial;
    this.fechaCreacion = fechaCreacion;
}

/**
 * Construye una cuenta con saldo inicial y fecha actual.
 * 
 * @param saldoInicial saldo inicial de la cuenta
 */
public PlayamarBank (double saldoInicial) {
    this(saldoInicial, LocalDate.now(), DEFAULT_MAX_DESCUBIERTO);
    
}
/**
 * Construye una cuenta sin parámetros.
 *
 */
public PlayamarBank () {
    this(0, LocalDate.now(), DEFAULT_MAX_DESCUBIERTO);
    
}

/**
 * Ingresa una cantidad de dinero en la cuenta.
 * <p>
 * Si la cantidad supera el saldo máximo permitido, se ajusta automáticamente.
 * </p>
 *
 * @param cantidad cantidad a ingresar
 */
public void ingresar(double cantidad) {
    if (cantidad <= 0) return;

    if (saldo + cantidad > saldoMaximo) {
        cantidad = saldoMaximo - saldo;
    }

    saldo += cantidad;
    totalIngresado += cantidad;
}
/**
 * Extrae una cantidad de dinero de la cuenta.
 * <p>
 * Tiene en cuenta el porcentaje de embargo y el límite de descubierto.
 * Una cuenta embargada no puede quedar con saldo negativo.
 * </p>
 *
 * @param cantidad cantidad a extraer
 * @return {@code true} si la extracción se realiza correctamente,
 *         {@code false} en caso contrario
 */
public boolean extraer(double cantidad) {
    if (cantidad <= 0) return false;

    double saldoEmbargado = saldo * (porcentajeEmbargo / 100);
    double saldoDisponible = saldo - saldoEmbargado;

    if (porcentajeEmbargo > 0 && cantidad > saldoDisponible) {
        return false;
    }

    if (saldo - cantidad < limiteDescubierto) {
        return false;
    }

    saldo -= cantidad;
    return true;
}
/**
 * Establece el porcentaje de embargo de la cuenta.
 *
 * @param porcentaje porcentaje de embargo a aplicar
 * @throws IllegalArgumentException si el porcentaje no es válido
 */
public void establecerEmbargo(double porcentaje) {
    if (porcentaje < MIN_EMBARGO || porcentaje > MAX_EMBARGO) {
        throw new IllegalArgumentException("Porcentaje de embargo no válido");
    }

    this.porcentajeEmbargo = porcentaje;

    double saldoEmbargado = saldo * (porcentajeEmbargo / 100);
    if (saldo - saldoEmbargado < 0) {
        saldo = saldoEmbargado;
    }
}

/**
 * Transfiere una cantidad determinada a otra cuenta.
 *
 * @param cantidad cantidad a transferir
 * @param destino  cuenta destino
 */
public void transferir(double cantidad, PlayamarBank destino) {
    if (cantidad <= 0) return; 
    if (this.extraer(cantidad)) {  
        destino.ingresar(cantidad);   
    }
}
/**
 * Transfiere todo el saldo disponible a otra cuenta.
 *
 * @param destino cuenta destino
 */
public void transferir(PlayamarBank destino) {
    double saldoTotal = this.getSaldoDisponible();
    if (saldoTotal > 0) {
        this.extraer(saldoTotal);       // Extraemos todo el saldo disponible
        destino.ingresar(saldoTotal);   // Ingresamos todo el saldo en la cuenta destino
    }
}

/**
 * Devuelve el identificador de la cuenta.
 *
 * @return identificador de la cuenta
 */
public String getId() {
    return id;
}

/**
 * Devuelve el saldo disponible teniendo en cuenta el embargo.
 *
 * @return saldo disponible
 */
public double getSaldo() {
    return saldo;
}

/**
 * Devuelve el saldo disponible teniendo en cuenta el embargo.
 *
 * @return saldo disponible
 */
public double getSaldoDisponible() {
    return saldo - (saldo * (porcentajeEmbargo / 100));
}

/**
 * Devuelve el porcentaje de embargo aplicado.
 *
 * @return porcentaje de embargo
 */
public double getPorcentajeEmbargo() {
    return porcentajeEmbargo;
}
/**
 * Devuelve la fecha de creación de la cuenta.
 *
 * @return fecha de creación
 */
public LocalDate getFechaCreacion() {
    return fechaCreacion;
}


/**
 * Devuelve una cadena que representa el estado actual de la cuenta.
 *
 * @return cadena con el estado de la cuenta
 */
@Override
public String toString() {
	return "PlayamarBank id = " + id + ", saldo = " + saldo + ", limiteDescubierto = " + limiteDescubierto
			+ ", porcentajeEmbargo = " + porcentajeEmbargo + ", saldoMaximo = " + saldoMaximo + ", totalIngresado = "
			+ totalIngresado + ", fechaCreacion = " + fechaCreacion;
}	


}