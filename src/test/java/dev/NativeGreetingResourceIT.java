package dev;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeGreetingResourceIT extends StudentResourceTest {

    // Execute the same tests but in native mode.
}