//import Structured.Events._
//import akka.actor.{ActorSystem, Props}
//
//import java.io.File
//import java.nio.file.{FileSystems, Files}
//import java.sql.Timestamp
//import scala.Console.println
//import scala.jdk.CollectionConverters.IteratorHasAsScala
//
//
//object Structured extends App{
//
//  object Events{
//    case class StartObserving(directory:File)
//    case object StopObserving
//    case class StoppedObserving(directory:File)
//    case class FileCreated(fqn:String,timestamp:Timestamp)
//    case class FileDeleted(fqn:String,timestamp: Timestamp)
//    case class FileModified(fqn:String,timestamp: Timestamp)
//  }
//
//
//  val actorSystem = ActorSystem("my_logic")
//  val observee = actorSystem.actorOf(Props(new CoreActor),"core_actor")
//  val observer=actorSystem.actorOf(Props(new FileactorWatcher(observee)),"dir_observer")
////  observer ! StartObserving(new File("/home/knoldus/Project1"))
//  observer ! StartObserving(path,true)
//  //do something
//
//
//
//  val dir = FileSystems.getDefault.getPath("/home/knoldus/Project1")
//  Files.walk(dir).iterator().asScala.filter(Files.isRegularFile(_)).foreach(println)
//
//  observer ! StopObserving
//
//}