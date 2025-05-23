package adapter.solved;

import adapter.shared.HTMLData;
import adapter.shared.JSONData;
import adapter.shared.StockDataProviderHTML;

public class AdapterHTML implements NeedJSON {
    private final StockDataProviderHTML provider;

    public AdapterHTML(StockDataProviderHTML provider) {
        this.provider = provider;
    }

    @Override
    public JSONData toJSON() {
        HTMLData html = provider.bieteHTML();
        // einfacher „Mapping“-Schritt: HTML → JSON
        String converted = html.getHtml() + " → { \"converted in HTML\": true }";
        return new JSONData(converted);    }
}
