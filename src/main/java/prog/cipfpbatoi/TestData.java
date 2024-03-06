/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.cipfpbatoi;

/**
 *
 * @author enana14
 */
public class TestData {
    
    public static void main(String[] args) {
        System.out.println("=== START - Prova de Constructors - START ===\n");
        
        System.out.println("--- Cree un nou objecte utilitzant el constructor parametritzat int int int (16,1,2021) ---");
        Data data1 = new Data(16, 1, 2021);
        data1.mostrarEnFormatES();
        data1.mostrarEnFormatGB();
        data1.mostrarEnFormatText();
        System.out.println("La data és correcta: " + data1.isCorrecta());
        System.out.println("La data és festiu: " + data1.isFestiu());
        System.out.println("El dia de la setmana és: " + data1.getDiaSetmana());
        System.out.println("-------------------------------\n");
        
        System.out.println("--- Cree un nou objecte utilitzant el constructor String 16/1/2021 ---");
        Data data2 = new Data("16/1/2021");
        data2.mostrarEnFormatES();
        data2.mostrarEnFormatGB();
        data2.mostrarEnFormatText();
        System.out.println("La data és correcta: " + data2.isCorrecta());
        System.out.println("La data és festiu: " + data2.isFestiu());
        System.out.println("El dia de la setmana és: " + data2.getDiaSetmana());
        System.out.println("-------------------------------\n");
        
        System.out.println("--- Comprove mitjançant el mètode isIgual que les dates representades per tots dos objectes són iguals ---");
        System.out.println("La data creada amb els constructors anteriors són iguals: " + data2.isIgual(data1));
        System.out.println("-------------------------------\n");
        
        System.out.println("--- Cree un nou objecte utilitzant el constructor per defecte ---");
        Data data3 = new Data();
        data3.mostrarEnFormatES();
        data3.mostrarEnFormatGB();
        data3.mostrarEnFormatText();
        System.out.println("La data és correcta: " + data3.isCorrecta());
        System.out.println("La data és festiu: " + data3.isFestiu());
        System.out.println("El dia de la setmana és: " + data3.getDiaSetmana());
        System.out.println("-------------------------------\n");
        
        System.out.println("=== FI - Prova de Constructors - FI ===\n");
        
        System.out.println("=== START - Prova de Mètodes afegir/restar dies - START ===\n");
        
        System.out.println("--- Endemà de la data inicial (16-1-2021) - (+1 dia) ---");
        Data data4 = data1.afegir(1);
        data4.mostrarEnFormatES();
        data4.mostrarEnFormatGB();
        data4.mostrarEnFormatText();
        System.out.println("La data és correcta: " + data4.isCorrecta());
        System.out.println("La data és festiu: " + data4.isFestiu());
        System.out.println("El dia de la setmana és: " + data4.getDiaSetmana());
        System.out.println("-------------------------------\n");
        
        System.out.println("--- Dia anterior a la data inicial (16-1-2021) - (-1 dia) ---");
        Data data5 = data1.restar(1);
        data5.mostrarEnFormatES();
        data5.mostrarEnFormatGB();
        data5.mostrarEnFormatText();
        System.out.println("La data és correcta: " + data5.isCorrecta());
        System.out.println("La data és festiu: " + data5.isFestiu());
        System.out.println("El dia de la setmana és: " + data5.getDiaSetmana());
        System.out.println("-------------------------------\n");
        
        System.out.println("--- Data corresponent a restar 30 dies a la data inicial (16-1-2021) - (-30 dies) ---");
        Data data6 = data1.restar(30);
        data6.mostrarEnFormatES();
        data6.mostrarEnFormatGB();
        data6.mostrarEnFormatText();
        System.out.println("La data és correcta: " + data6.isCorrecta());
        System.out.println("La data és festiu: " + data6.isFestiu());
        System.out.println("El dia de la setmana és: " + data6.getDiaSetmana());
        System.out.println("-------------------------------\n");
        
        System.out.println("=== FI - Prova de Mètodes afegir/restar - FI ===\n");
        
        System.out.println("=== START - Prova del mètode modificador - START ===\n");
        
        System.out.println("--- Modifique la data del primer objecte creat (16-1-2020) per la data 22-1-2021 ---");
        data1.set(22, 1, 2021);
        data1.mostrarEnFormatES();
        data1.mostrarEnFormatGB();
        data1.mostrarEnFormatText();
        System.out.println("La data és correcta: " + data1.isCorrecta());
        System.out.println("La data és festiu: " + data1.isFestiu());
        System.out.println("El dia de la setmana és: " + data1.getDiaSetmana());
        System.out.println("-------------------------------\n");
        
        System.out.println("=== FI - Prova del mètode modificador - FI ===\n");
        
        System.out.println("=== START - Prova del getters - START ===\n");
        
        System.out.println("--- Get informació d'una copia del objecte amb la data (16,1,2021) ---");
        Data data7 = data2.clone();
        System.out.println("El dia del objecte: " + data7.getDia());
        System.out.println("El mes del objecte: " + data7.getMes());
        System.out.println("El any del objecte: " + data7.getAny());
        System.out.println("Es bisiesto: " + Data.isBisiesto(data7.getAny()));
        System.out.println("Dies del mes actual: " + Data.getDiesMes(data7.getMes(), data7.getAny()));
        System.out.println("Dies del any actual: " + Data.getDiesAny(data7.getAny()));
        System.out.println("El numero de la setmana: " + data7.getNumeroSetmana());
        System.out.println("-------------------------------\n");
        
        System.out.println("=== FI - Prova dels getters - FI ===\n");
    }
}
