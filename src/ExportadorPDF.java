public class ExportadorPDF implements ExportadorVisitor {
    @Override
    public void exportar(RelatorioFinanceiro r) {
        System.out.println("Gerando PDF com cadeados de segurança: " + r.getFinanceiro());
    }

    @Override
    public void exportar(RelatorioVendas r) {
        System.out.println("Gerando PDF com gráficos: " + r.getVendas());
    }

    @Override
    public void exportar(RelatorioRH r) {
        System.out.println("Gerando PDF confidencial: " + r.getRH());
    }
}

