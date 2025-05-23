package adapter.solved;

import adapter.shared.StockDataProvider;
import adapter.shared.StockDataProviderHTML;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StockDataProvider incompatibleLibrary = new StockDataProvider();
        NeedJSON adapter = new Adapter(incompatibleLibrary);

        Client client = new Client();
        client.main(adapter);

        StockDataProviderHTML htmlProvider = new StockDataProviderHTML();
        NeedJSON adapterHTML = new AdapterHTML(htmlProvider);

        client.main(adapterHTML);
    }
}