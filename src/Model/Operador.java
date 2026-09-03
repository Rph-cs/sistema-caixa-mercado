package Model;

import Model.enums.Perfil;

public class Operador {
    
    private int idOperador;
    private String nomeOperador;
    private String loginOperador;
    private String senhaOperador;
    private Perfil perfilOperador;
    
    public Operador(){
        
    }
    
    public int getIdOperador(){
        return idOperador;
    }
    
    public void setIdOperador(int idOperador){
        this.idOperador = idOperador;
    }
    
    public String getNomeOperador(){
        return nomeOperador;
    }
    
    public void setnomeOperador(String nomeOperador){
        this.nomeOperador = nomeOperador;
    }
    
    public String getLoginOperador(){
        return loginOperador;
    }
    
    public void setloginOperador(String loginOperador){
        this.loginOperador = loginOperador;
    }
    
    public String getSenhaOperador(){
        return senhaOperador;
    }
    
    public void setsenhaOperador(String senhaOperador){
        this.senhaOperador = senhaOperador;
    }
    
    public Perfil getPerfilOperador(){
        return perfilOperador;
    }
    
    public void setperfilOperador(Perfil perfilOperador){
        this.perfilOperador = perfilOperador;
    }
}
