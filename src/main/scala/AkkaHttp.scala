//import Structured.Events.{StartObserving, StopObserving}
//import akka.actor.Actor.Receive
//import akka.actor.{Actor, ActorRef, ActorSystem, Props}
//
//import java.io.File
//import java.nio.file.{Path, StandardWatchEventKinds, WatchEvent, WatchKey, WatchService}
//import java.sql.Timestamp
//import scala.collection.mutable
//
//object Structured {
//
//    object Events {
//        case class StartObserving(directory: File)
//
//        case class StoppedObserving(directory: File)
//
//        case class FileCreated()
//
//        case class FileDeleted()
//
//        case class FileModified()
//    }
//
//    class FileActor(val path:Path, val recursive:Boolean)  extends Actor {
//
//        val watchService: WatchService = path.getFileSystem.newWatchService()
//        val keys = new mutable.HashMap[WatchKey,Path]
//        var trace = false
//         def receive: Receive = {
//               var event: WatchEvent[_]
//             val kind = event.kind
//             val event_path = event.context().asInstanceOf[Path]
//            case StartObserving(directory) => if(kind.equals(StandardWatchEventKinds.ENTRY_CREATE)) {
//                println("Entry created: " + event_path
//            }
//            else if(kind.equals(StandardWatchEventKinds.ENTRY_DELETE)) {
//                println("Entry deleted: " + event_path)
//            }
//            else if(kind.equals(StandardWatchEventKinds.ENTRY_MODIFY)) {
//                println("Entry modified: " + event_path)
//            }
//         }
//            case StopObserving => ???
//        }
//
//        val actorSystem = ActorSystem("my_logic")
//        // val observee = actorSystem.actorOf(Props(new CoreActor),"core_actor")
//        val observer = actorSystem.actorOf(Props(new FileActor(Path, true)
//
//        observer ! StartObserving(new File("some_dir"))
//
//    }
//}