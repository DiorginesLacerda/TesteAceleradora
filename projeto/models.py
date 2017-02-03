class Funcionario(object):
    def __init__(self, nome, salario, admissao):
        self.nome = nome
        self.salario = salario
        self.admissao = admissao
        


class Imposto(object):
    def __init__(self, inss=10, seg_vida=15, vale_refeicao=11, vale_transporte=5):
        self.inss= inss
        self.seg_vida= seg_vida
        self.vale_refeicao=vale_refeicao
        self.vale_transporte=vale_transporte
    