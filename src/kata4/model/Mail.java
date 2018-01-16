package kata4.model;

public class Mail {
    private final String mail;
    
    public Mail(String mail){
       this.mail = mail;
    }
    
    public String getMail(){
        return mail;
    }
    
    public String getDomain(){
        if(!mail.contains("@")){
            return null;
        }
        String[] domain = mail.split("@");
        System.out.println(domain[1]);
        return domain[1];
    }
}