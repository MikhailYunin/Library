package entity;

import javax.persistence.*;
import java.util.Calendar;


@Entity
@Table
@NamedQueries({
        @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b"),
})
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private int pageCount;
    private int qtyOfIllustration;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar Date;

}
