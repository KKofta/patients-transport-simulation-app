# Patients transport simulation app

---

### Table of Contents

* [General information](#general-information)
* [Motivation](#motivation)
* [Used Technologies](#used-technologies)
* [Application usage](#application-usage)
* [Screenshots](#screenshots)

---

### General information

Patients transport simulation app is a desktop application with wich it is possible to optimize and simulate transport of patients to hospitals in the shortest time possible. 

Basic rules: 
1. At the beginning an ambulance moves the first patient (determined by patients id) to the nearest hospital;
2. If in this hospital there avaible beds then the patient is left there, otherwise the patient is being taken to the next closest hospital (determined by a value of every road on a map);
3. Steps are reapeted for a patient with the next lowest id until there are patients on the map.

The ambulance is able to rescue patients wich appear only inside the area of a map determined by a convex hull of hospitals and monuments.

In the project following algorithms were used:
* <a href="https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm">Dijkstra's algorithm</a> - finds the shortest path between patients and hospitals. 
* <a href="https://en.wikipedia.org/wiki/Convex_hull_algorithms">Convex Hull Algorithm</a> - finds convex hull of hospitals and monuments.
* Intersection finder algorithm - finds intersection of roads.

#### Preview

<img src="https://github.com/KKofta/patients-transport-simulation-app/blob/master/docs/Preview/Preview.gif">

---

### Motivation

Patients transport simulation app was created as a group project in the second year of Computer Science degree for a subject _Algorithms and Data Structures_. It was supposed to (and it did) improve understanding of algorithms, time complexity, data structures concepts. 

---

### Used Technologies

* `Java 11`
* `JavaFX 15.0.1`
* `CSS`
* `Git`
* `Netbeans 12.0`
* `JUnit 4.12`

---

### Application usage

The application requires two `.txt` files to work properly. Sample files `originalMapData` and `originalPatientsData` are prepared in `inputFiles` folder. Data stored in files should be in a format as shown below:

* File with a configuration of a map - hospitals, objects, roads:

```txt
# Hospitals (id | name | x | y | Number of beds | Avaible beds)
1 | Hospital nr 997 | 10 | 10 | 1000 | 100
2 | Hospital of Warsaw | 100 | 120 | 999 | 99
3 | Cracow Hospital | 120 | 130 | 99 | 0
4 | Hospital of USA | 10 | 140 | 70 | 1
5 | Hospital Neverfound | 140 | 10 | 996 | 0

# Objects (id | name | x | y)
1 | Statue of Liberty | -1 | 50
2 | Sphinx | 110 | 55
3 | Mount Rushmore National Memorial | 40 | 70

# Roads (id | hospital_id | hospital_id | distance)
1 | 1 | 2 | 700
2 | 1 | 4 | 550
3 | 1 | 5 | 800
4 | 2 | 3 | 300
5 | 2 | 4 | 550
6 | 3 | 5 | 600
7 | 4 | 5 | 750
```

* File with coordinates of patients:

```txt
# Patients (id | x | y)
1 | 20 | 20
2 | 99 | 105
3 | 23 | 40
```

It is also possible to add patients from GUI before or during simulation. 

In order to run application locally you must have installed JDK 11.

1. Clone this repository:
```bash
   git clone https://github.com/KKofta/patients-transport-simulation-app.git 
```

2. Run application with `.jar` file:
```bash
   java -jar PATH/AmbulanceSimulation.jar
```
`.jar` file will work only if it will be in the same folder with folder `icons`.

---

### Screenshots

* Original map:

<img src="https://github.com/KKofta/patients-transport-simulation-app/blob/master/docs/Preview/Map1.png">

* Other sample map:

<img src="https://github.com/KKofta/patients-transport-simulation-app/blob/master/docs/Preview/Map2.png">

---