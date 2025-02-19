package enums;

public enum TipoTarjeta {
    Titular("Titular"), Extension("Extensión");

    private String code;

    TipoTarjeta(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
