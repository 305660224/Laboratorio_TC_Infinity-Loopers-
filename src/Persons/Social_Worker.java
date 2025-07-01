package Persons;

/**
 * 01/07/2025
 * @author Dennis Marchena
 */
public class Social_Worker extends Person {
    private String Id;
    private String Email;
    private String Phone;
    private String Coverage;

    //Metodos GET
    public String getId() {
        return Id;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public String getCoverage() {
        return Coverage;
    }

    //Metodos SET
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPhone(String Phone) {
        if (!Phone.matches("^[245678]\\d{1}-\\d{2}-\\d{2}-\\d{2}$")) {
            this.Phone = Phone;
        }
    }

    public void setCoverage(String Coverage) {
        this.Coverage = Coverage;
    }

    public Social_Worker(String Id, String Name, String Email, String Phone, String Coverage) {
        if (!Phone.matches("^[245678]\\d{1}-\\d{2}-\\d{2}-\\d{2}$") || !Id.matches("^[1-7]-?\\d{4}-?\\d{4}")) {
            throw new IllegalArgumentException("Datos ingresados inválidos."); //Detiene el constructor si es invalido el Id, o Phone
        }
        super(Name, Id);
        this.Id = Id;
        this.Email = Email;
        this.Phone = Phone;
        this.Coverage = Coverage;
    }

    
}
