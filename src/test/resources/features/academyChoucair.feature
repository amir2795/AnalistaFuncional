# language:es
# Autor: Amir McCoy

@historias
Característica: : Academia Choucair
  Como un usuario quiero aprender a automatizar en screamplay en la Choucair Academy con el curso de automatizacion
  @escenario1
  Escenario: Buscar un curso de automatizacion
    Dado brandon quiere aprender automatizacion en la academia Choucair
    | strUser   | strPassword  |
    | brandon   | 123456       |
    Cuando busco el curso en la plataforma de la academia choucair
    | strCourse               |
    | Metodologia Bancolombia |
    Entonces encuentra el curso llamado recursos
    | strCourse               |
    | Metodologia Bancolombia |