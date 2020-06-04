package AirplaneBooking
import AirplaneBooking.*

import java.io.File
import java.io.BufferedReader
import java.util.Scanner
import kotlin.system.exitProcess

fun welcome(){
	val read = Scanner(System.`in`)
	println("\t\tDelhi To Bangalore Flight Booking")
	println("\t\t***** ** ********* ****** *******")
	println("\n")
	println("\t\tWelcome to Airline Ticket Booking")
	println("\tPress :")
	println("\t 1. Book Seats")
	println("\t 2. view seating Arrangement")
	println("\t 3. Exit")
	var n = read.nextInt()
	if (n == 1)
		{book()
		welcome()}
	else if (n == 2)
		{seating()
		 welcome()}	
	else if(n == 3)
		exitProcess(0)
	else
		println("Invalid Input")
	
}

fun main(){
	welcome()
	// println(b);
	// val bufferedReader: BufferedReader = File("Booked.txt").bufferedReader()
 //    var filled = mutableListOf<String>()
	// val inputString = bufferedReader.use { it.readText() }
	// filled.add(inputString)
	// println(filled)
 
  // val inputString = bufferedReader.use { it.readText() }
  // println(inputString)
	  }