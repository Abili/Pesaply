package com.raisac.pesaply;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            NestedJSONObjectTest();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void NestedJSONObjectTest() throws JSONException {
        final String RESPONSES = "responses";
        final String ID = "id";
        final String ENUMERATOR_ID = "enumeratorId";
        final String ENUMERATOR_NAME = "enumeratorName";
        final String LAST_MODIFIED_DATE = "lastModifiedDate";
        final String PERCENTAGE_COMPLETED = "percentCompleted";
        final String QUESTION_ID = "questionId";
        final String QUESTIONAIRE_ID = "questionaireId";
        final String QUESTION_KEY = "questionKey";
        final String RESPONDENT_NAME = "respondentName";
        final String SECTION_ID = "sectionId";
        final String VALUE = "value";

        String jsonDataString = "{\n" +
                "\"responses\": [\n" +
                "{\n" +
                "\"id\": \"0044\",\n" +
                "\"enumeratorId\": \"1\",\n" +
                "\"enumeratorName\": \"Demo Data\",\n" +
                "\"lastModifiedDate\": \"2020-08-19T21:52:05.911Z\",\n" +
                "\"percentCompleted\": 0,\n" +
                "\"questionId\": \"id_name\",\n" +
                "\"questionKey\": \"\",\n" +
                "\"questionaireId\": \"293403\",\n" +
                "\"respondentName\": \"Demo Data\",\n" +
                "\"sectionId\": \"index_description\",\n" +
                "\"value\": \"Tiss\"\n" +
                "},\n" +
                "{\n" +
                "\"id\": \"0044\",\n" +
                "\"enumeratorId\": \"1\",\n" +
                "\"enumeratorName\": \"Demo\",\n" +
                "\"lastModifiedDate\": \"2020-08-19T21:52:05.911Z\",\n" +
                "\"percentCompleted\": 0,\n" +
                "\"questionId\": \"location_of_establishment\",\n" +
                "\"questionKey\": \"\",\n" +
                "\"questionaireId\": \"293403\",\n" +
                "\"respondentName\": \"Demo Data\",\n" +
                "\"sectionId\": \"industry_description\",\n" +
                "\"value\": {\n" +
                "\"location\": null,\n" +
                "\"subward\": null,\n" +
                "\"village\": null,\n" +
                "\"plot_number\": null\n" +
                "}\n" +
                "},\n" +
                "{\n" +
                "\"id\": \"04250\",\n" +
                "\"enumeratorId\": \"2\",\n" +
                "\"enumeratorName\": \"J Mwangi\",\n" +
                "\"lastModifiedDate\": \"2020-08-21T15:03:49.525Z\",\n" +
                "\"percentCompleted\": 0,\n" +
                "\"questionId\": \"industry_name\",\n" +
                "\"questionKey\": \"1.1\",\n" +
                "\"questionaireId\": \"2934073\",\n" +
                "\"respondentName\": \"UKAYA FARM\",\n" +
                "\"sectionId\": \"establishment_description\",\n" +
                "\"value\": \"UKAYA FARM\"\n" +
                "},\n" +
                "{\n" +
                "\"id\": \"04258\",\n" +
                "\"enumeratorId\": \"2\",\n" +
                "\"enumeratorName\": \"J Lao\",\n" +
                "\"lastModifiedDate\": \"2020-08-21T15:03:49.525Z\",\n" +
                "\"percentCompleted\": 0,\n" +
                "\"questionId\": \"location_of_establishment\",\n" +
                "\"questionKey\": \"1.2\",\n" +
                "\"questionaireId\": \"2934073\",\n" +
                "\"respondentName\": \"UKAY FARM\",\n" +
                "\"sectionId\": \"establishment_description\",\n" +
                "\"value\": {\n" +
                "\"1.2.1\": \"06\",\n" +
                "\"1.2.2\": \"04\",\n" +
                "\"1.2.3\": \"113\",\n" +
                "\"1.2.4\": \"01\",\n" +
                "\"1.2.5\": \"\",\n" +
                "\"1.2.6\": null\n" +
                "}\n" +
                "}\n" +
                "]\n" +
                "\n" +
                "}";
        JSONObject jsonObject = new JSONObject(jsonDataString);
        JSONArray jsonArray = jsonObject.getJSONArray(RESPONSES);
        for (int i = 0; i < jsonArray.length(); i++) {
            System.out.println(
                    (jsonArray.getJSONObject(i).getString(ID)) + "\n" +
                    (jsonArray.getJSONObject(i).getString(ENUMERATOR_ID)) + "\n" +
                    (jsonArray.getJSONObject(i).getString(ENUMERATOR_NAME)) + "\n" +
                    (jsonArray.getJSONObject(i).getString(LAST_MODIFIED_DATE)) + "\n" +
                    (jsonArray.getJSONObject(i).getString(PERCENTAGE_COMPLETED)) + "\n" +
                    (jsonArray.getJSONObject(i).getString(QUESTION_ID)) + "\n" +
                    (jsonArray.getJSONObject(i).getString(QUESTION_KEY)) + "\n" +
                    (jsonArray.getJSONObject(i).getString(QUESTIONAIRE_ID)) + "\n" +
                    (jsonArray.getJSONObject(i).getString(RESPONDENT_NAME)) + "\n" +
                    (jsonArray.getJSONObject(i).getString(SECTION_ID)) + "\n" +
                    (jsonArray.getJSONObject(i).getString(VALUE)));

        }
    }
}
