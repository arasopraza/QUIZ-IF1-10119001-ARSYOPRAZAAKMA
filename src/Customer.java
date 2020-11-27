import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Customer extends ServicePrice implements CustomerInvoice {
    private String nama, email;
    private boolean member;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String currentTime() {
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String dateFormated;

        localDateTime = LocalDateTime.now();
        dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
        dateFormated = localDateTime.format(dateTimeFormatter);
        System.out.println("Date Transaction : " + dateFormated);
        return null;
    }
}
