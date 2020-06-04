package AirplaneBooking
import AirplaneBooking.*

import java.io.File
import java.io.BufferedReader
import java.util.Scanner

// fun bookingsummary(name2 : String){
// 	println("Dear $name2 ,")
// 	println("your Booking has been confirmed")
// }

fun seating(){
	// var filled = mutableListOf<String>()
	// val bufferedReader: BufferedReader = File("Booked.txt").bufferedReader()
	// val inputString = bufferedReader.use { it.readText() }
	// filled.add(inputString)
  	// println(filled)
  	for(i in 1..80){
  		if(i<10)
  			print("C"+ "0"+"$i"+"   ")
  		else
  		    print("C"+ "$i"+"   ")
		if(i%8 == 0){
  			print("\n")
  		}
  		else if (i%4 == 0)
  			print("\t")
  	}
}
fun seatingarrangement(){
	val read = Scanner(System.`in`)
	val bufferedReader: BufferedReader = File("filled.txt").bufferedReader()
    var filled = mutableListOf<String>()
	val inputString = bufferedReader.use { it.readText() }
	filled.add(inputString)
	// println(filled)
	for(i in 1..80){
		if(filled.contains(i.toString()))
			{print("***   ")}
		else{
  		if(i<10)
  			print("C"+ "0"+"$i"+"   ")
  		else
  		    print("C"+ "$i"+"   ")
		if(i%8 == 0){
  			print("\n")
  		}
  		else if (i%4 == 0)
  			print("\t")
  	}
  	}
  	println("select your seat no :")
  	var n = read.nextInt()
  	File("filled.txt").appendText("\n" + n.toString())
  	File("Booked.txt").appendText("\n" + n.toString())
}

fun book(){
	// var name = readLine()
	println("Enter the Booking Details")
	println("\n Enter Second Name :")
	var name1 = readLine()
	println("Enter First Name :")
	var name2 = readLine()
	println("Enter Sex(Male/Female)")
	var sex = readLine()
	println("enter age :")
	var age = readLine()
	seatingarrangement()
	val myfile = File("Booked.txt")
	myfile.appendText("\n"+name1)
	myfile.appendText("\n"+name2)
	myfile.appendText("\n"+sex)
	myfile.appendText("\n"+age.toString())
	println("Dear $name2 ,")
	println("your Booking has been confirmed")


}