package saulodev.com.builder;

import java.math.BigDecimal;

public class ProdutoBuilder {

    private Integer id;
    private String descricao;
    private Double valorCusto;
    private Double ipi;
    private Double frete;
    private Double pis;
    private Double confins;
    private ProdutoBuilder(Builder builder) {
        this.id = builder.id;
        this.descricao = builder.descricao;
        this.valorCusto = builder.valorCusto;
        this.ipi = builder.ipi;
        this.frete = builder.frete;
        this.pis = builder.pis;
        this.confins = builder.confins;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(Double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public Double getIpi() {
        return ipi;
    }

    public void setIpi(Double ipi) {
        this.ipi = ipi;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }

    public Double getPis() {
        return pis;
    }

    public void setPis(Double pis) {
        this.pis = pis;
    }

    public Double getConfins() {
        return confins;
    }

    public void setConfins(Double confins) {
        this.confins = confins;
    }

    public static class Builder {
        private Integer id;
        private String descricao;
        private Double valorCusto;
        private Double ipi;
        private Double frete;
        private Double pis;
        private Double confins;

        public Builder(Integer id, String descricao) {
            this.id = id;
            this.descricao = descricao;
        }
        public Builder valorCusto(BigDecimal vlrCusto) {
            this.valorCusto = valorCusto;
            return this;
        }

        public Builder ipi(Double vlrIpi) {
            this.ipi = vlrIpi;
            return this;
        }

        public Builder frete(Double vlrFrete) {
            this.frete = vlrFrete;
            return this;
        }

        public Builder pis(Double vlrPis) {
            this.pis = vlrPis;
            return this;
        }

        public Builder confins(Double vlrConfins) {
            this.confins = vlrConfins;
            return this;
        }

        public ProdutoBuilder build() {
            return new ProdutoBuilder(this);
        }
    }
}
