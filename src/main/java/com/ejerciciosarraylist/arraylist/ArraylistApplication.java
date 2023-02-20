package com.ejerciciosarraylist.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArraylistApplication {


  // public static ArrayList crearArrayList(int n1,int n2, int n3, int n4, int n5){
  //   ArrayList<Integer> numeros = new ArrayList<Integer>();
  //   numeros.add(n1);
  //   numeros.add(n2);
  //   numeros.add(n3);
  //   numeros.add(n4);
  //   numeros.add(n5);
  //   return numeros;
  // }

  public static ArrayList crearArrayList(int... elementos){
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    for(int num : elementos){
      numeros.add(num);
    }
    return numeros;
  }

  //--------- Ejercicio 1 ---------
  public static void mostrarArrayList(){
    ArrayList<Integer> array1 = crearArrayList(0, 28, 30, 10, 4);
    System.out.println("--------- Ejercicio 1 ---------");
    System.out.println(array1);
  }





  //--------- Ejercicio 2 ---------
  public static void mostrarArrayListReverse(){
    ArrayList<Integer> array1 = crearArrayList(0, 28, 30, 10, 4);
    ArrayList<Integer> array1Invertido = new ArrayList<Integer>(array1);
    Collections.reverse(array1Invertido);

    System.out.println("--------- Ejercicio 2 ---------");
    System.out.println(array1Invertido);
  }





  //--------- Ejercicio 3 ---------
  public static void sumarElementosArrayList(){
    ArrayList<Integer> array1 = crearArrayList(1, 3, 6, 82, 23);

    int suma = 0;

    for(int i = 0; i < array1.size(); i++){
      suma = suma + array1.get(i);
    }
    System.out.println("--------- Ejercicio 3 ---------");
    System.out.println("La suma de los numeros del siguiente arreglo '"+array1+"' es de: "+suma);
  }




  //--------- Ejercicio 4 ---------
  public static void numeroMenorArrayList(){
    ArrayList<Integer> array1 = crearArrayList(90, 1, 38, 0, 29,4);

    ArrayList<Integer> array1MenorMayor = new ArrayList<Integer>(array1);
    Collections.sort(array1MenorMayor);
    int numeroMenor = array1MenorMayor.get(0);

    System.out.println("--------- Ejercicio 4 ---------");
    System.out.println("El número menor del ArrayList '"+array1+"' es "+numeroMenor);
  }




  //--------- Ejercicio 5 ---------
  public static void sumaProducto(){
    ArrayList<Integer> array1 = crearArrayList(0,28,30,10,4);
    ArrayList<Integer> array2 = crearArrayList(1,3,6,82,23);
    ArrayList<Integer> sumaArrayList = new ArrayList<Integer>();
    ArrayList<Integer> productoArrayList = new ArrayList<Integer>();

    for(int i = 0; i < array1.size();i++){
      sumaArrayList.add(array1.get(i)+array2.get(i));
      productoArrayList.add(array1.get(i)*array2.get(i));
    }
    System.out.println("--------- Ejercicio 5 ---------");
    System.out.println(array1);
    System.out.println(array2);
    System.out.println("------------ Suma -------------");
    System.out.println(sumaArrayList);
    System.out.println("---------- Producto -----------");
    System.out.println(productoArrayList);
  }




  //--------- Ejercicio 6 ---------
  public static void lecturaElementosInvertir(){
    Scanner sc = new Scanner(System.in);
    ArrayList<String> array1 = new ArrayList<String>();
    ArrayList<String> array1Invertido = new ArrayList<String>();
    for(int i = 0; i < 6; i++){
      System.out.println((i+1)+".-Ingrese un elemento al ArrayList");
      array1.add(sc.nextLine());
    }
    array1Invertido.addAll(array1);
    Collections.reverse(array1Invertido);


    System.out.println("--------- Ejercicio 6 ---------");
    System.out.println("ArrayList Inicial: "+array1);
    System.out.println("ArrayList Invertido: "+array1Invertido);
    //sc.close();
  }




  //--------- Ejercicio 7 ---------
  public static void notasAlumnos(){
    Scanner sc = new Scanner(System.in);
    System.out.println("--------- Ejercicio 7 ---------");
    System.out.println("Ingrese la cantidad de alumnos");
    double numeroAlumnos = sc.nextDouble();
    double promedioCurso = 0;
    double notaAlumno = 0;
    ArrayList<Double> notasPrimerControl = new ArrayList<Double>();
    ArrayList<Double> notasSobrePromedio = new ArrayList<Double>();


    
    for(int i = 0; i < numeroAlumnos; i++){
      do{
        System.out.println((i+1)+".-Ingrese la nota del alumno n°"+(i+1));
        notaAlumno = sc.nextDouble();

        if(notaAlumno < 1 || notaAlumno > 7){
          System.out.println("Error: Las notas admitidas van del 1 al 7");
        }
        
        
      }while(notaAlumno < 1 || notaAlumno > 7);
      notasPrimerControl.add(notaAlumno);
      promedioCurso = promedioCurso + notaAlumno;
      notaAlumno = 0;
    }
    promedioCurso = promedioCurso / numeroAlumnos;

    for(int i = 0; i < notasPrimerControl.size();i++){
      if(notasPrimerControl.get(i) > promedioCurso){
        notasSobrePromedio.add(notasPrimerControl.get(i));
      }
    }

    System.out.println("-------------------------------");
    System.out.println("Notas del primer control: "+notasPrimerControl);
    System.out.println("Promedio del curso: "+promedioCurso);
    System.out.println("Notas que superan al Promedio: "+notasSobrePromedio);
    //sc.close();

  }





  //--------- Ejercicio 8 ---------
  public static void multiplos(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el largo del ArrayList");
    int largoArrayList = sc.nextInt();
    System.out.println("Ingrese el número que desea sacar los múltiplos");
    int numero = sc.nextInt();
    ArrayList<Integer> multiplos = new ArrayList<Integer>();

    for(int i = 0; i < largoArrayList; i++){
      multiplos.add(numero * (i+1));
    }

    System.out.println("--------- Ejercicio 8 ---------");
    System.out.println("-------------------------------");
    System.out.println("Multiplos: "+multiplos);


  }


	public static void main(String[] args) {
		//--------- Ejercicio 1 ---------
    //mostrarArrayList();



    //--------- Ejercicio 2 ---------
    //mostrarArrayListReverse();



    //--------- Ejercicio 3 ---------
    //sumarElementosArrayList();



    //--------- Ejercicio 4 ---------
    //numeroMenorArrayList();



    //--------- Ejercicio 5 ---------
    //sumaProducto();
    



    //--------- Ejercicio 6 ---------
    //lecturaElementosInvertir();



    //--------- Ejercicio 7 ---------
    //notasAlumnos();



    //--------- Ejercicio 8 ---------
    multiplos();
	}

}
