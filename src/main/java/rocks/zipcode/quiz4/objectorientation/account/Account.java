package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */

public class Account{

    public void setId(long id) {
        this.id = id;
    }

    private long id;
    public Account()
    {
        this.id=0l;
    }
    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//
//    }
}
