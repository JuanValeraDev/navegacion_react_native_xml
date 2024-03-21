import React from 'react';
import { View, Button, Text, NativeModules} from 'react-native';

const App = () => {
  return (
    <View style={{ flex: 1, justifyContent: 'center', alignItems: 'center' }}>

      <Text>Estoy en la vista creada con React Native, exportada como App y con nombre del componente: botonIntegratedRNProject </Text>
 <Button
        title="Go to My Activity"
        onPress={() => NativeModules.MyActivityModule.navigateToMyActivity()}
      />
    </View>
  );
};

export default App;