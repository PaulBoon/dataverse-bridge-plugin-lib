package nl.knaw.dans.dataverse.bridge.plugin.common;

import java.util.Optional;

/*
 * Created by Eko Indarto
 */
public interface IResponseData {

    String getResponse();

    default Optional<String> getState()  {
        return Optional.empty();
    }

    default Optional<String> getPid() {
        return Optional.empty();
    }

    default Optional<String> getLandingPage() {
        return Optional.empty();
    }

}
