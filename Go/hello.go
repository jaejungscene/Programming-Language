/*
It is a mandatory statement, as Go programs run in packages.
The main package is the starting point to run the program.
Each package has a path and name associated with it.
*/
package main

/*
The next line import "fmt" is a preprocessor command
which tells the Go compiler to include the files lying in the package fmt.
*/
import "fmt"

/*
the main function where the program execution begins.
*/
func main() {
	/*
		Notice the capital P of Println method.
		In Go language, a name is exported if it starts with capital letter.
		Exported means the function or variable/constant is accessible to the importer of the respective package.
	*/
	fmt.Println("hello, world!")
}
