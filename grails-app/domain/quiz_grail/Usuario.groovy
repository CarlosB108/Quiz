package quiz_grail

class Usuario {


    String nombre;
    String apellido;
    int cedula;
    String email;

    Date fecha_de_nacimiendo;

    static belongsTo = [Evento]
    static hasMany = [evento : Evento]



    static constraints = {
        cedula(unique: true)
        nombre(blank: false)
        apellido(blank: false)
        email(email: true)
        fecha_de_nacimiendo(Date: true)
    }
}



