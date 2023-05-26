/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author marc_
 */
public class Bola {
    private String cor;
    private int circunferencia;
    private String material;
    public Bola(String cor, int circunferencia, String material){
        super();
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }
    public void trocaCor(String cor){
        this.cor = cor;
    }
    public String mostraCor(){
        return this.cor;
    }
    public static void main(String[] args) {
        Bola b = new Bola("azul", 10, "Borracha");
        System.out.println(b.mostraCor());
        b.trocaCor("vermelha");
        System.out.println(b.mostraCor());
    }
}
