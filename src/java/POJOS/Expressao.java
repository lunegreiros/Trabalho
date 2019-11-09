package POJOS;
// Generated 09/11/2019 10:17:12 by Hibernate Tools 4.3.1



/**
 * Expressao generated by hbm2java
 */
public class Expressao  implements java.io.Serializable {


     private Integer id;
     private Integer palavra_id;
     private Palavra palavra;
     private String expressao;

    public Expressao() {
    }

    public Expressao(int id, int palavra_id, String expressao) {
       this.id=id;
       this.palavra_id = palavra_id;
       this.expressao = expressao;
    }
    
    public Expressao(Palavra palavra) {
        this.palavra = palavra;
    }
    public Expressao(Palavra palavra, String expressao) {
       this.palavra = palavra;
       this.expressao = expressao;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Palavra getPalavra() {
        return this.palavra;
    }
    
    public void setPalavra(Palavra palavra) {
        this.palavra = palavra;
    }
    public String getExpressao() {
        return this.expressao;
    }
    
    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }




}

