package quiz_grail

class Evento {


    String nombre;
    Date fecha_inicio;
    Date fecha_fin;

    static hasMany = [usuarios : Usuario] // el cascada

    static constraints = {

        nombre(blank: false)
        fecha_inicio(Date: true)
        fecha_fin(Date: true)
        usuarios(nullable: true) //permitir agregacion

    }
}
