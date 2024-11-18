package co.edu.uniquindio.poo;

public abstract class Usuario {
    public String nombre;
    public String clave;
    public String preguntaSeguridad;
    public String respuestaSeguridad;
    public double salario;
    public String tipoUsuario;

    public Usuario(String nombre, String clave, String preguntaSeguridad, String respuestaSeguridad, double salario, String tipoUsuario) {
        this.nombre = nombre;
        this.clave = clave;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
        this.salario = salario;
        this.tipoUsuario = tipoUsuario;
    }

    ///////////////////////////////////////Getters and Setters////////////////////////////////////////////
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }
    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }
    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }
    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public abstract boolean verificarCredenciales(String nombreUsuario, String contrasena);
    
    /**
     * Cambia la clave del usuario.
     * @param claveActual La clave actual del usuario.
     * @param nuevaClave La nueva clave que se desea establecer.
     * @return true si el cambio fue exitoso, false si la clave actual es incorrecta.
     */
    public abstract boolean cambiarClave(String claveActual, String nuevaClave);

    /**
     * Verifica la respuesta de seguridad y devuelve la clave si es correcta.
     * @param respuesta La respuesta proporcionada por el usuario.
     * @return La clave si la respuesta es correcta, null en caso contrario.
     */
    public abstract String recuperarClave(String respuesta);

}
