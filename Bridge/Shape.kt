package org.example

fun main() {
    val supermarket = Supermarket(CashPayment())
    supermarket.pay()
}

interface DrawingTool {
    fun draw()
}

class Pen : DrawingTool {
    override fun draw() {
        println("Drawing with Pen")
    }
}

class Pencil : DrawingTool {
    override fun draw() {
        println("Drawing with Pencil")
    }
}

class Marker : DrawingTool {
    override fun draw() {
        println("Drawing with Marker")
    }
}

class Brush : DrawingTool {
    override fun draw() {
        println("Drawing with Brush")
    }
}

abstract class Shape(val drawingTool: DrawingTool) {
    abstract fun draw()
}

class Circle(drawingTool: DrawingTool) : Shape(drawingTool) {
    override fun draw() {
        drawingTool.draw()
        println("Drawing Circle")
    }
}

class Square(drawingTool: DrawingTool) : Shape(drawingTool) {
    override fun draw() {
        drawingTool.draw()
        println("Drawing Square")
    }
}

class Triangle(drawingTool: DrawingTool) : Shape(drawingTool) {
    override fun draw() {
        drawingTool.draw()
        println("Drawing Triangle")
    }
}

class Rectangle(drawingTool: DrawingTool) : Shape(drawingTool) {
    override fun draw() {
        drawingTool.draw()
        println("Drawing Rectangle")
    }
}

class Star(drawingTool: DrawingTool) : Shape(drawingTool) {
    override fun draw() {
        drawingTool.draw()
        println("Drawing Star")
    }
}
