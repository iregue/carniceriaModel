package carniceriamodel

class Product {

    String image
    String name
    String description_extensa
    String stars
    Date date_deleted
    String description_breve
    String price
    String category
    String quality

    static constraints = {
        image nullable:true
        name nullable: true
        description_extensa nullable: true
        stars nullable: true
        date_deleted nullable: true
        description_breve nullable: true
        price nullable: true
        category nullable: true
        quality nullable: true
    }
}
