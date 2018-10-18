class Aluno:
    def __init__(self, matricula, nome = "", data_nascimento="", endereco=None, historico=None, responsaveis=None):
        self.matricula = matricula
        self.nome = nome
        self.data_nascimento = data_nascimento
        self.endereco = endereco
        self.historico = historico
        self.responsaveis=responsaveis
