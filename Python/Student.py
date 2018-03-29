class Student():
    def __init__(self, name, score):
        self.name = name
        self.test_score = score

    def say_hello(self):
        print "Hello, my name is " + self.name

class Course():
    def __init__(self, name):
        self.name = name
        self.students = []

    def add_student(self, student):
        self.students.append(student)

    def get_average(self):
        total = 0

        for student in self.students:
            total += student.test_score

        course_average = total / len(self.students)
        return course_average

    def show_students(self):
        for student in self.students:
            print student.name

student1 = Student("Kevin", 100)
student2 = Student("Michael", 80)
student3 = Student("Joey", 50)

Biology = [student1, student3]
PE = [student2]
biology = Course("Biology")
PE = Course(PE)

biology.add_student(student1)
biology.add_student(student2)
print biology.get_average()

biology.add_student(student3)
print biology.get_average()
biology.show_students()
