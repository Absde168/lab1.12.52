fun main() {
    val grades = arrayOf(
        intArrayOf(4, 5, 3, 4, 5, 4, 3, 5, 4, 5),
        intArrayOf(3, 3, 4, 5, 4, 3, 5, 4, 3, 4),
        intArrayOf(5, 5, 5, 5, 5, 5, 5, 5, 5, 5),
        intArrayOf(2, 3, 4, 2, 3, 4, 2, 3, 4, 2),
        intArrayOf(4, 4, 4, 4, 4, 4, 4, 4, 4, 4),
        intArrayOf(3, 4, 5, 3, 4, 3, 5, 4, 5, 3),
        intArrayOf(5, 5, 4, 4, 4, 5, 5, 5, 5, 4),
        intArrayOf(2, 3, 4, 5, 2, 3, 4, 3, 2, 4),
        intArrayOf(3, 4, 4, 5, 3, 4, 3, 4, 5, 4),
        intArrayOf(4, 3, 5, 3, 4, 4, 5, 4, 4, 3)
    )

    val fifthStudentGrades = grades[4]

    val averageGrade = fifthStudentGrades.average()
    
    println("Средняя оценка пятого ученика: %.2f".format(averageGrade))
}
