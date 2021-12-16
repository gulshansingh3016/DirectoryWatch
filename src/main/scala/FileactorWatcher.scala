//import Structured.Events._
//import akka.actor.IgnoreActorRef.path
//import akka.actor.{Actor, ActorRef}
//
//import java.nio.file.{Path, StandardWatchEventKinds, WatchEvent, WatchKey}
//import java.sql.Timestamp
//import scala.collection.mutable
//
//class FileactorWatcher(coreActor: ActorRef) extends Actor with Runnable{
//
//  override def receive: Receive = {
//
//      case StartObserving(path:Path, recursive:Boolean) =>  val watchService = path.getFileSystem().newWatchService()
//        val keys = new mutable.HashMap[WatchKey,Path]
//        var trace = false
//
//
//      case StopObserving => ???
//    }
//
//    private def onFileCreate(fqn:String,timestamp: Timestamp):Unit = coreActor ! FileCreated(fqn,timestamp)
//    private def onFileDelete(fqn:String,timestamp: Timestamp):Unit = coreActor ! FileDeleted(fqn,timestamp)
//    private def onFileModify(fqn:String,timestamp: Timestamp):Unit = coreActor ! FileModified(fqn,timestamp)
//
//
//  override def run(): Unit = {
//    val event:WatchEvent[_]
//    val kind = event.kind
//    val event_path = event.context().asInstanceOf[Path]
//    if(kind.equals(StandardWatchEventKinds.ENTRY_CREATE)) {
//      println("Entry created: " + event_path)
//  }
//    else if(kind.equals(StandardWatchEventKinds.ENTRY_DELETE)) {
//      println("Entry deleted: " + event_path)
//  }
//    else if(kind.equals(StandardWatchEventKinds.ENTRY_MODIFY)) {
//      println("Entry modified: " + event_path)
//  }
//}
//}
