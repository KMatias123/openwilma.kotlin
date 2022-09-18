package org.openwilma.kotlin.classes.exams

import org.openwilma.kotlin.classes.people.WilmaTeacher
import java.time.LocalDateTime
import java.util.StringJoiner

data class Exam (
    val timestamp: LocalDateTime?,
    val teachers: List<WilmaTeacher?>,
    val courseCode: String?,
    val courseName: String?,
    val subject: String?,
    val additionalInfo: String?,
    val grade: String?,
    val verbalGrade: String?
)