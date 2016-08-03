package models

case class File(id: String, name: String, content: String)

object File {
  def getAll = List(File("1", "name1", "content1"), File("2", "name2", "content2"), File("3", "name3", "content3"))
}

@MongoEntity ("collectionName")
public class Car extends MongoModel {
  public String name;
  public String colour;
  public int topSpeed;
}