package carniceriamodel

class Product {

    String image
    String name
    String description_extensa
    String stars
    Date date_deleted
    String description_breve

    static constraints = {
        image nullable:true
        name nullable: true
        description_extensa nullable: true
        stars nullable: true
        date_deleted nullable: true
        description_breve nullable: true
    }
}
