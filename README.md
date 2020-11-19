# JavaPOO_19_11_Her_Pol_Fin_Int
Herança Polimorfismo Final Interface

--Herança(extends): Permite o desenvolvimento de uma classe (classe filha) 
	com tudo que já tem em outra classe (classe mãe ou base).
Importante: no Java usamos muito o conceito de Interface 
	para herança múltipla.
--Polimorfismo = sobrecarga ou sobrescrita. 
	Ex. no construtor temos sobrecarga(overload). 
	Nos métodos temos sobreescrita(@Override)
	Geralmente classes Mãe ou Base são classes abstratas, 
	para evitar sua instanciação. 
	Podemos ter também métodos abstratos
--final : faz com que um método/variável não seja alterado. 
	Podemos colocar uma classe com final, 
	desta forma não pode ser herdada. 
	Note que este conceito é praticamente inverso de abstract. 
	Enquanto uma Classe abstract não pode ser instanciada, 
	final não pode ser herdada.
extends é apenas um, implements pode ter vários 
	Ex implements DadosPessoais, Serializable
--Encapsulamento = private, public, final etc.
--super = vai na classe mãe (ou base)
--this = vai na classe atual.
