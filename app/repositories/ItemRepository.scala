package repositories

import com.google.inject.ImplementedBy
import models.Item
import repositories.impl.ItemRepositoryImpl

import scala.concurrent.Future

@ImplementedBy(classOf[ItemRepositoryImpl])
trait ItemRepository extends Repository[Item] {

  def updateStatus(id: Long, idStatus: Int): Future[Int]

}
