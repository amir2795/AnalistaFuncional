# language:es
# Autor: Amir McCoy

@historias
Característica: : Test
  Como usuario quiere registrarse en la pagina Utest
  @escenario1
  Escenario: Registrarse en Utest
    Dado Que Amir quiere registrarse en Utest
      | strNombre  | strApellido  | strEmail       |
      | Amir       | McCoy        | amir@gmail.com |
    Cuando el entra a la pagina en Utest
    Entonces empieza a registrarse Utest