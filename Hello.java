public class Hello
{
 // This comment was left by Sean Hanna, HI!
 public static void main( String argv[] )
 {
 String name = "World";
 if ( argv.length != 0 )
 {
 name = argv[0];
 }
 System.out.println( "Hello, " + name + "!" );
 }
}