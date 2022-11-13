package model.site

import model.component.ViewValueTodo

case class ViewValueSiteTodoList(
  todoList: Seq[ViewValueTodo],

  val pageTitle: String,
) extends ViewValueSiteLayout