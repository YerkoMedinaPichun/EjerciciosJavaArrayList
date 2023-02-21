package com.ejerciciosarraylist.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;


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






  /*
    /*Ejercicio
  vamos a pedir al usuario que ingrese la cantidad alumnos a los cuales les asignará una nota,  luego de que ingrese la catidad de notas de cada alumnos, se va a desplegar un menú.
  las opciones del menú serán la siguentes:
  1.- mostrar el promedio de notas
  2.- mostrar si la nota es aprobatoria o reprobatoria
  3.- mostrar si la nota está por sobre o por debajo del promedio del curso
 
   
   */

   public static void menuOpciones(){
    Scanner sc = new Scanner(System.in);

    int cantidadAlumnos;    
    int cantidadNotas;

    do{
      System.out.print("Ingrese la cantidad de alumnos: ");
      cantidadAlumnos = sc.nextInt(); 
      if(cantidadAlumnos < 1 || cantidadAlumnos > 5){
        System.out.println("El rango de alumnos es de 1 a 5");
      }
    }while(cantidadAlumnos < 1 || cantidadAlumnos > 5);

    do{
      System.out.print("Ingrese la cantidad de notas por alumno: ");
      cantidadNotas = sc.nextInt();
      if(cantidadNotas < 1 || cantidadNotas > 5){
        System.out.println("la cantidad de notas es de 1 a 5");
      }
    }while(cantidadNotas < 1 || cantidadNotas > 5);

    HashMap<String,ArrayList<Double>> alumnos = new HashMap<String,ArrayList<Double>>();
    double promedioCurso = 0;
    double notaAprobatoria = 4.0;

    for(int i = 0; i < cantidadAlumnos; i++){
      ArrayList<Double> notasAlumno = new ArrayList<Double>();
      //notasAlumno.clear();
      /* Desafío, verificar donde debería o como debería limpiar el arreglo para que funcione con la declaración de manera global */

      sc.nextLine();//Esto es para borrar un espacio que se genera al presionar ENTER -> 3 = 3\n
      //en la lectura del scanner queda guardado \n, por eso hay que ocupar sc.nextLine para "borrar" el residuo,
      //este problema pasa cuando ocupo el Scanner con un int o Double y luego quiero ocupar un String
      System.out.print("Ingrese el Nombre del Alumno: ");
      String nombreAlumno = sc.nextLine();
      
      //System.out.print("Ingrese la cantidad de Notas del Alumno '"+nombreAlumno+"': ");
      //int cantidadNotas = sc.nextInt();
      
      for(int j = 0; j < cantidadNotas; j++){
        double nota;
        do{
          System.out.print("Ingrese la nota n°"+(j+1)+" de "+nombreAlumno+": ");
          nota = sc.nextDouble();
          if(nota < 1 || nota > 7){
            System.out.println("Error: la nota debe ser de 1 a 7");
          }

        }while(nota < 1 || nota > 7);
        
        notasAlumno.add(nota);
      }
      alumnos.put(nombreAlumno, notasAlumno);
    }
    //1.-Mostrar notas
    HashMap<String,Double> promediosAlumnos = new HashMap<String,Double>(calcularPromediosAlumnos(alumnos));
    promedioCurso = calcularPromedioCurso(promediosAlumnos);

    int opcion = 0;
    do{
      
      do{
        System.out.println("-------------- Menú --------------");
        System.out.println("1.- Mostrar Notas de los Alumnos");
        System.out.println("2.- Mostrar si la nota del promedio de cada alumno es Aprobatoria o Reprobatoria");
        System.out.println("3.- Mostrar si la nota está bajo, sobre o igual al promedio del curso");
        System.out.println("0.- Salir");
        System.out.println("----------------------------------");
        opcion = sc.nextInt();

        if(opcion == 1){
          //System.out.println(alumnos);
          //System.out.println(promediosAlumnos);
          mostrarNotasAlumnos(alumnos);
        }else if(opcion == 2){
          calcularNotaAprobatoria(promediosAlumnos, notaAprobatoria);
        }else if(opcion == 3){
          calcularSobrePromedioCurso(promediosAlumnos, promedioCurso);
        }else if(opcion == 0){
          System.out.println("Hasta pronto!");
        }else{
          System.out.println("ERROR: Ingresa una opción válida");
        }

      }while(opcion < 0 || opcion > 3);

    }while(opcion != 0);


    sc.close();
   }

  public static void mostrarNotasAlumnos(HashMap<String,ArrayList<Double>> alumnos){
    for(String alumno : alumnos.keySet()){
      System.out.println("--------------------------");
      System.out.println(alumno);
      System.out.println("--------------------------");
      ArrayList<Double> notas = alumnos.get(alumno);
      for(int i = 0; i < notas.size(); i++){
        System.out.println(notas.get(i));
      }
      System.out.println("--------------------------");
    }
  }

  public static void calcularNotaAprobatoria(HashMap<String,Double> promediosAlumnos,Double notaAprobatoria){
    for(String alumno : promediosAlumnos.keySet()){
      Double nota = promediosAlumnos.get(alumno);
      if(nota >= notaAprobatoria){
        System.out.println(alumno+" : " + nota + " -> Aprobado");
      }else{
        System.out.println(alumno+" : " + nota + " -> Reprobado");
      }
    }
  }

  public static void calcularSobrePromedioCurso(HashMap<String,Double> promediosAlumnos, Double promedioCurso){
    for(String alumno : promediosAlumnos.keySet()){
      Double nota = promediosAlumnos.get(alumno);
      if(nota > promedioCurso){
        System.out.println(alumno+" : " + nota + " -> Superior al Promedio del Curso: "+promedioCurso);
      }else if(nota == promedioCurso){
        System.out.println(alumno+" : " + nota + " -> Igual al Promedio del Curso : "+promedioCurso);
      }else{
        System.out.println(alumno+" : " + nota + " -> Inferior al Promedio del Curso : "+promedioCurso);
      }
    }
  }

  public static Double calcularPromedioAlumno(ArrayList<Double> notas){
    Double promedioAlumno = 0.0;
    for(int i = 0; i < notas.size();i++){
      promedioAlumno += notas.get(i);
    }
    return promedioAlumno/notas.size();
  }

  public static HashMap<String,Double> calcularPromediosAlumnos(HashMap<String,ArrayList<Double>> alumnos){
    HashMap<String,Double> promediosAlumnos = new HashMap<String,Double>();
    Double promedioAlumno = 0.0;
    
    for(String alumno : alumnos.keySet()){
      ArrayList<Double> notas = new ArrayList<Double>(alumnos.get(alumno));
      promedioAlumno = calcularPromedioAlumno(notas);

      promediosAlumnos.put(alumno, promedioAlumno);
    }
    
    return promediosAlumnos;
  }

  public static Double calcularPromedioCurso(HashMap<String,Double> promediosAlumnos){
    Double promedioCurso = 0.0;

    for(String alumno : promediosAlumnos.keySet()){
      promedioCurso += promediosAlumnos.get(alumno);
    }
    promedioCurso /= promediosAlumnos.size();

    return promedioCurso;
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
    //multiplos();


    menuOpciones();
	}

}
