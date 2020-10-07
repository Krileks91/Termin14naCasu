package com.example.termin14nacasu;

public class Fruit {

    public static Fruit[] fruits = new Fruit[]{
      new Fruit(0,"Pomorandza", "Narandzaste je boje","orange.png",4.5f),
      new Fruit(1,"Jabuka", "Zelene je boje","apple.png",3.5f),
      new Fruit(2,"B0reskva", "Uglavnom je zuto-crvene boje","peach.png",5.0f)
    };

    private int id;
    private String name;
    private String description;
    private String imageFilename;
    private float rating;


    public Fruit(int id, String name, String description, String imageFilename, float rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageFilename = imageFilename;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageFilename() {
        return imageFilename;
    }

    public void setImageFilename(String imageFilename) {
        this.imageFilename = imageFilename;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageFilename='" + imageFilename + '\'' +
                ", rating=" + rating +
                '}';
    }
}
