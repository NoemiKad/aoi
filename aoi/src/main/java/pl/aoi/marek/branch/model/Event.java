package pl.aoi.marek.branch.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "event_database")
public class Event {


    @Id
    @GeneratedValue
    @Column(name = "Event_ID")
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Place")
    private String place;

    @Column(name = "No_rooms")
    private int roomNumber;

    @Column(name = "Opening_date")
    private Date OpeningDate;

    @Column(name = "Ending_date")
    private Date EndingDate;

    public Event() {
    }

    public Event(String place, int roomNumber, Date openingDate, Date endingDate) {
        this.place = place;
        this.roomNumber = roomNumber;
        OpeningDate = openingDate;
        EndingDate = endingDate;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getOpeningDate() {
        return OpeningDate;
    }

    public void setOpeningDate(Date openingDate) {
        OpeningDate = openingDate;
    }

    public Date getEndingDate() {
        return EndingDate;
    }

    public void setEndingDate(Date endingDate) {
        EndingDate = endingDate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", roomNumber=" + roomNumber +
                ", OpeningDate=" + OpeningDate +
                ", EndingDate=" + EndingDate +
                '}';
    }
}
