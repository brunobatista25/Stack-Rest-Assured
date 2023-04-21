package {{package_name}}.model;

public class User {
    private String nome;
    private String email;
    private String password;
    private String administrador;

    public User(String nome, String email, String password, String administrador) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    @Override
    public String toString() {
        return "{\n" +
                "    \"nome\": \"" + nome + "\",\n" +
                "    \"email\": \"" + email + "\",\n" +
                "    \"password\": \""+ password +"\",\n" +
                "    \"administrador\": \""+ administrador +"\"\n" +
                "}";
    }
}
