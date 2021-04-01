package br.desafiosix.desafiosix.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codCliente;
    private Long cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String contatoPrincipal;
    private Long telefone;

    
    public Long getCodCliente() {
        return codCliente;
    }
    public void setCodCliente(Long codCliente) {
        this.codCliente = codCliente;
    }
    public Long getCnpj() {
        return cnpj;
    }
    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public String getContatoPrincipal() {
        return contatoPrincipal;
    }
    public void setContatoPrincipal(String contatoPrincipal) {
        this.contatoPrincipal = contatoPrincipal;
    }
    public Long getTelefone() {
        return telefone;
    }
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
        result = prime * result + ((codCliente == null) ? 0 : codCliente.hashCode());
        result = prime * result + ((contatoPrincipal == null) ? 0 : contatoPrincipal.hashCode());
        result = prime * result + ((nomeFantasia == null) ? 0 : nomeFantasia.hashCode());
        result = prime * result + ((razaoSocial == null) ? 0 : razaoSocial.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (cnpj == null) {
            if (other.cnpj != null)
                return false;
        } else if (!cnpj.equals(other.cnpj))
            return false;
        if (codCliente == null) {
            if (other.codCliente != null)
                return false;
        } else if (!codCliente.equals(other.codCliente))
            return false;
        if (contatoPrincipal == null) {
            if (other.contatoPrincipal != null)
                return false;
        } else if (!contatoPrincipal.equals(other.contatoPrincipal))
            return false;
        if (nomeFantasia == null) {
            if (other.nomeFantasia != null)
                return false;
        } else if (!nomeFantasia.equals(other.nomeFantasia))
            return false;
        if (razaoSocial == null) {
            if (other.razaoSocial != null)
                return false;
        } else if (!razaoSocial.equals(other.razaoSocial))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        return true;
    }

    
}
