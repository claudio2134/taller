//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Date;

class RegistroPedido {
    private String nombreDeUsuario;
    private String tipoDePermiso;
    private Date fechaDelPedido;

    // Constructor
    public RegistroPedido(String nombreDeUsuario, String tipoDePermiso, Date fechaDelPedido) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.tipoDePermiso = tipoDePermiso;
        this.fechaDelPedido = fechaDelPedido;
    }

    // Métodos para acceder a los datos
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public String getTipoDePermiso() {
        return tipoDePermiso;
    }

    public Date getFechaDelPedido() {
        return fechaDelPedido;
    }

    // Métodos para establecer los datos
    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public void setTipoDePermiso(String tipoDePermiso) {
        this.tipoDePermiso = tipoDePermiso;
    }

    public void setFechaDelPedido(Date fechaDelPedido) {
        this.fechaDelPedido = fechaDelPedido;
    }

    @Override
    public String toString() {
        return "RegistroPedido{" +
                "nombreDeUsuario='" + nombreDeUsuario + '\'' +
                ", tipoDePermiso='" + tipoDePermiso + '\'' +
                ", fechaDelPedido=" + fechaDelPedido +
                '}';
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de RegistroPedido
        RegistroPedido registro = new RegistroPedido("usuario1", "admin", new Date());

        // Imprimir los detalles del registro
        System.out.println(registro);
    }
}