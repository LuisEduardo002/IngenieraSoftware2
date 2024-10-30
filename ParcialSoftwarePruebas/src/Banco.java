import java.util.List;

public class Banco {
List <Cuenta> cuentas;
public Banco(     List<Cuenta> cuentas) {
    this.cuentas = cuentas;
}
public void setCuentas(List<Cuenta> cuentas) {
    this.cuentas = cuentas;
}
public void depositar(String numeroCuenta, double cantidad){
    if (cantidad <= 0){
        throw new IllegalArgumentException("Cantidad mayor que 0");
    }
    for(Cuenta cuenta: cuentas){
        if (cuenta.getNumeroCuenta().equals(numeroCuenta)){
            double saldo = cuenta.getSaldo() + cantidad;
            cuenta.setSaldo(saldo);
            return;
        }
    }
    throw new IllegalArgumentException(" no encontrada");
}
public void retirar(String numeroCuenta, double cantidad){
    if (cantidad <= 0){
        throw new IllegalArgumentException("Cantidad mayor que 0");
    }
    for(Cuenta cuenta: cuentas){
        if (cuenta.getNumeroCuenta().equals(numeroCuenta)){
            if (cantidad >= cuenta.getSaldo()){
                throw new IllegalArgumentException("Cantidad mayor que saldo disponible");

            }
            double saldo = cuenta.getSaldo() - cantidad;
            cuenta.setSaldo(saldo);
            return;
        }
    }
    throw new IllegalArgumentException(" no encontrada");
}
public boolean existe(String titular){
    for(Cuenta cuenta: cuentas){
        if (cuenta.getTitular().equals(titular)){
            return true;
        }
    }
    return false;
}
}
