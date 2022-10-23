package dev.cperez.com.entidad;

public class Dato {
  public String id;
  
  public String nom;
  
  public String app;
  
  public String tel;
  
  public String clave;
  
  public Dato() {}
  
  public Dato(String id) {
    this.id = id;
  }
  
  public Dato(String id, String nom, String app, String tel, String clave) {
    this.id = id;
    this.nom = nom;
    this.app = app;
    this.tel = tel;
    this.clave = clave;
  }
  
  public String toString() {
    return "Dato{id=" + this.id + ", nom=" + this.nom + ", app=" + this.app + ", tel=" + this.tel + ", clave=" + this.clave + "} \n";
  }
  
  public String getId() {
    return this.id;
  }
  
  public String getNom() {
    return this.nom;
  }
  
  public String getApp() {
    return this.app;
  }
  
  public String getTel() {
    return this.tel;
  }
  
  public String getClave() {
    return this.clave;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public void setNom(String nom) {
    this.nom = nom;
  }
  
  public void setApp(String app) {
    this.app = app;
  }
  
  public void setTel(String tel) {
    this.tel = tel;
  }
  
  public void setClave(String clave) {
    this.clave = clave;
  }
}
