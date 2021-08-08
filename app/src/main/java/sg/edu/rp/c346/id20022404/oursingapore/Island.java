package sg.edu.rp.c346.id20022404.oursingapore;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Island implements Serializable {

	private int id;
	private String name;
	private String description;
	private int area;
	private int stars;

    public Island(int id, String name, String description, int area, int stars) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.area = area;
        this.stars = stars;

    }

    public int getId() {
        return id;
    }

    public Island setId(int id) {
        this.id = id;
        return this;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getStars() {
        return stars;
    }

    public Island setStars(int stars) {
        this.stars = stars;
        return this;
    }

    @NonNull
    @Override
    public String toString() {
        String starsString = "";
        for(int i = 0; i < stars; i++){
            starsString += "*";
        }
        return name + "\n" + description + " - " + area + "\n" + starsString;

    }
}
